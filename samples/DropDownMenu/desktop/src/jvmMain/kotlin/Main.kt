import dev.atsushieno.common.App
import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        DesktopMaterialTheme {
            App()
        }
    }
}