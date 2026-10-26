package sa.edu.iau.cshj.lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import sa.edu.iau.cshj.lab5.navigation.CourseApp
import sa.edu.iau.cshj.lab5.ui.theme.Lab5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5Theme {
                CourseApp()
            }
        }
    }
}