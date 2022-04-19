package com.capg.multiplexbookingsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.multiplexbookingsystem.dao.AdminRepository;
import com.capg.multiplexbookingsystem.exception.AdminException;
import com.capg.multiplexbookingsystem.model.Admin;
import com.capg.multiplexbookingsystem.service.AdminService;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private AdminRepository adminRepository;

	@PutMapping("/admins/{id}")
	public ResponseEntity<Admin> updateEmployee(@PathVariable(value = "id") Long adminId,
			@RequestBody Admin adminDetails) throws AdminException {
		Admin admin = adminRepository.findById(adminId)
				.orElseThrow(() -> new AdminException("Admin not found for this id :: " + adminId));

		admin.setName(adminDetails.getName());
		admin.setEmail(adminDetails.getEmail());
		admin.setPassword(adminDetails.getPassword());
		admin.setMobileNo(adminDetails.getMobileNo());
		admin.setUserType(adminDetails.getUserType());
		final Admin updatedAdmin = adminRepository.save(admin);
		return ResponseEntity.ok(updatedAdmin);
	}

	@DeleteMapping("/admins/{adminId}")
	public ResponseEntity<String> delAdmins(@PathVariable("adminId") Long adminId) {
		System.out.println("Acc ID:"+adminId);
		try {
			adminService.delAccount(adminId);
		} catch (Exception ex) {
			throw new AdminException(ex.getMessage());
		}
		return new ResponseEntity<String>("Admin Deleted.", HttpStatus.OK);
	}


	@GetMapping("/admins")
	public ResponseEntity<List<Admin>> getAdmins() {
		List<Admin> adminList = adminService.showAdmins();
		return new ResponseEntity<List<Admin>>(adminList, HttpStatus.OK);
	}

	
	@GetMapping("/admins/{adminId}")
	public ResponseEntity<Optional<Admin>> getAdminById(@PathVariable("adminId") Long adminId) {
		Optional<Admin> admin = adminService.showAdminById(adminId);
	return new ResponseEntity<Optional<Admin>>(admin, HttpStatus.OK);
}

	@PostMapping("/admins")
	public Admin createAdmin(@RequestBody Admin admin) {
		return adminService.addAdmin(admin);
	}

}
