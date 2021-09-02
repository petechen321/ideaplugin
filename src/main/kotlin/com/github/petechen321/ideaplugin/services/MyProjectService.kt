package com.github.petechen321.ideaplugin.services

import com.github.petechen321.ideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
