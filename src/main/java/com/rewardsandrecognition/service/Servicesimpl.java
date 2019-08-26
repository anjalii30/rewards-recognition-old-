package com.rewardsandrecognition.service;


import com.rewardsandrecognition.model.EmployeeModel;
import com.rewardsandrecognition.model.ProjectModel;
import com.rewardsandrecognition.repository.EmployeeRepository;
import com.rewardsandrecognition.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
@Transactional
public class Servicesimpl implements NServices {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    ProjectRepository projectRepository;

    @Override
    public List<ProjectModel> getProjectsList() {
        return (List<ProjectModel>)projectRepository.getProjectsList();
    }

    @Override
    public List<EmployeeModel> getEmployeeByProject(String employeeid) {
        return (List<EmployeeModel>)employeeRepository.getEmployeeByProject(employeeid);
    }
}