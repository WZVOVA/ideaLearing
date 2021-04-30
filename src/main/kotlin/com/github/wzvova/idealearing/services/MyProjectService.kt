package com.github.wzvova.idealearing.services

import com.github.wzvova.idealearing.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
