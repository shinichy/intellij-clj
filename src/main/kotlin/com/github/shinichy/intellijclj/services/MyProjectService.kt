package com.github.shinichy.intellijclj.services

import com.intellij.openapi.project.Project
import com.github.shinichy.intellijclj.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
