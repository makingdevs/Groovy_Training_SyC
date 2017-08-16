@Grapes(
  @Grab(group='org.fusesource.jansi', module='jansi', version='1.16')
)

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

AnsiConsole.systemInstall();

System.out.println( ansi().eraseScreen().fg(RED).a("Hello").fg(GREEN).a(" World").reset() );
