package com.redhat.module.template.multiplex.process;

import java.io.UnsupportedEncodingException;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class MultiplexController {
	private Logger logger = Logger.getLogger(getClass());
	public void append(Exchange exchange) throws UnsupportedEncodingException {
		logger.info(" IN APPEND");
		byte[] body = (byte[]) exchange.getIn().getBody().toString().getBytes("utf8");
		String length = String.valueOf(body.length);
		byte[] ba = length.getBytes();
		byte[] tmp = new byte[body.length + 5];
		tmp[0] = 'A';
		for (int i = 0; i < ba.length; i++)
			tmp[1 + i] = ba[i];
		for (int i = 0; i < body.length; i++)
			tmp[5 + i] = body[i];
		exchange.getIn().setBody(tmp);
	}

}
