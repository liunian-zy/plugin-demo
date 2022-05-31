package com.github.liunianzy.plugindemo.services

import com.intellij.openapi.project.Project
import com.github.liunianzy.plugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
