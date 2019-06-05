package com.redhat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConfigurationProperties(prefix = "infinispan")
public class JDGAutoConfiguration {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * The name of the Infinispan service.
	 */
//	private String service = "datagrid-app-hotrod";

	/**
	 * The name of the Infinispan cache.
	 */
	private String cacheName = "default";

//	@Bean
//	@Scope("singleton")
//	public EmbeddedCacheManager localCacheContainer() {
//		logger.info(">>>> DefaultCacheManager Created");
//		return new DefaultCacheManager();
//	}

	/**
	 * Defines a bean named 'remoteCacheContainer' that points to the remote
	 * Infinispan cluster.
	 */
//	@Bean(initMethod = "start", destroyMethod = "stop")
//	public BasicCacheContainer remoteCacheContainer(Environment environment) {
//
//		String serviceBaseName = service.toUpperCase().replace("-", "_");
//		String host = environment.getProperty(serviceBaseName + "_SERVICE_HOST");
//		String port = environment.getProperty(serviceBaseName + "_SERVICE_PORT");
//		Objects.requireNonNull(host, "Infinispan service host not found in the environment");
//		Objects.requireNonNull(port, "Infinispan service port not found in the environment");
//
//		String hostPort = host + ":" + port;
//		logger.info("Connecting to the Infinispan service at {}", hostPort);
//
//		ConfigurationBuilder builder = new ConfigurationBuilder().forceReturnValues(true).addServers(hostPort);
//
//		return new RemoteCacheManager(builder.create(), false);
//	}

	/**
	 * Defines a Camel idempotent repository based on the Infinispan cache
	 * container.
	 */
//	@Bean
//	public InfinispanIdempotentRepository infinispanRepository(BasicCacheContainer cacheContainer) {
//		return InfinispanIdempotentRepository.infinispanIdempotentRepository(cacheContainer, cacheName);
//	}

//	public String getService() {
//		return service;
//	}
//
//	public void setService(String service) {
//		this.service = service;
//	}

	public String getCacheName() {
		return cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}
}