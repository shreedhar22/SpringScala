package hello
import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
object HelloWebApplication {
def main(args: Array[String]) {
SpringApplication.run(classOf[HelloWebApplication])
}
}
@Controller
@EnableAutoConfiguration
class HelloWebApplication {
@RequestMapping(Array("/"))
@ResponseBody
def home(): String = "Hello World!"
}

