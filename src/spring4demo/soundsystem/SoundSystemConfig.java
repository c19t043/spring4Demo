package spring4demo.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({CDConfig.class,CDPlayConfig2.class})
@ImportResource("classpath:/spring4demo/soundsystem/xmlconfig/compactDiscConfig.xml")
public class SoundSystemConfig {

}
