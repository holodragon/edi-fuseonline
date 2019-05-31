package com.redhat.module.template.multiplex.process;

import java.io.ByteArrayOutputStream;
import java.util.List;

import org.apache.camel.component.netty4.ChannelHandlerFactory;
import org.apache.log4j.Logger;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class BancsDecoder extends ByteToMessageDecoder implements ChannelHandlerFactory {

	private Logger logger = Logger.getLogger(getClass());

	@Override
	public ChannelHandler newChannelHandler() {
		// TODO Auto-generated method stub
		return new BancsDecoder();
	}

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
		logger.info(" IN Decoder");
		final int messageLength = 1069;
		if (in.readableBytes() < messageLength) {
			logger.info("message length < 1069, " + in);
			return;
		}

		byte[] flag = new byte[1];
		in.readBytes(flag);
		if (flag[0] == '-') {
			byte[] header = new byte[4];
			in.readBytes(header);
			try {
				this.logger.info("LEHGTH = " + Integer.parseInt(new String(header)));
				byte[] data = new byte[Integer.parseInt(new String(header))];
				in.readBytes(data);
				out.add(data);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
