package com.jetbrains.compose


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.ComposePanel
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import javax.swing.JComponent

class DemoDialog(project: Project?) : DialogWrapper(project) {
        init {
            title = "Demo"
            init()
        }

        override fun createCenterPanel(): JComponent {
            return ComposePanel().apply {
                setBounds(0, 0, 800, 600)
                setContent {
                    Surface(modifier = Modifier.fillMaxSize()) {
                        Column {
                            Text("Hello Compose")
                        }
                    }

                }
            }
        }
    }

//                    DemoDialog(tempProject).show()
