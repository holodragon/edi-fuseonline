package com.redhat.module.template.multiplex.process;

import org.apache.camel.component.netty4.ChannelHandlerFactory;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class BancsEncoder extends MessageToByteEncoder<byte[]> implements ChannelHandlerFactory {

	@Override
	public ChannelHandler newChannelHandler() {
		// TODO Auto-generated method stub
		return new BancsEncoder();
	}

	@Override
	protected void encode(ChannelHandlerContext ctx, byte[] msg, ByteBuf out) throws Exception {
		out.writeBytes(msg) ;
	}

}
