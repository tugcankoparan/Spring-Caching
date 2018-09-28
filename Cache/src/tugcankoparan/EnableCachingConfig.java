package tugcankoparan;  
import java.util.Arrays;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import  tugcankoparan.Employee;
  
@Configuration
@EnableCaching
public class EnableCachingConfig  {
	@Bean
    public Employee employee() {
       return new Employee();
    }
    @Bean
    public CacheManager cacheManager() {
       SimpleCacheManager cacheManager = new SimpleCacheManager();
       cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("test")));
       return cacheManager;
    }
}  
 