package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Member;
import com.example.demo.service.FirebaseService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	FirebaseService firebaseService;
	
	@GetMapping("/insertMember")
    public String insertMember(@RequestParam Member member) throws Exception{
        return firebaseService.insertMember(member);
    }

    @GetMapping("/getMemberDetail")
    public Member getMemberDetail(@RequestParam String id) throws Exception{
        return firebaseService.getMemberDetail(id);
    }

    @GetMapping("/updateMember")
    public String updateMember(@RequestParam Member member) throws Exception{
        return firebaseService.updateMember(member);
    }

    @GetMapping("/deleteMember")
    public String deleteMember(@RequestParam String id) throws Exception{
        return firebaseService.deleteMember(id);
    }
}
