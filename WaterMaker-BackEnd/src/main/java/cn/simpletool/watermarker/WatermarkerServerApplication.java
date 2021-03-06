package cn.simpletool.watermarker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ZhanJingbo
 */
@SpringBootApplication
@MapperScan("cn.simpletool.watermarker.dao")
public class WatermarkerServerApplication {
	/**
	 * 系统入口
	 * @param args 启动参数
	 */
	public static void main(String[] args) {
		SpringApplication.run(WatermarkerServerApplication.class, args);
	}

}
