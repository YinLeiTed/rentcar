package com.yinlei.rentcar.tools;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


public class EmailUtils {
	public static String sendEmail(String email)
	{
        String code=MyUUID.getUUID(6);
	    try {
            Properties props = new Properties();

            // 开启debug调试
            //props.setProperty("mail.debug", "true");
            // 发送服务器需要身份验证
            props.setProperty("mail.smtp.auth", "true");
            // 设置邮件服务器主机名
            props.setProperty("mail.host", "smtp.163.com");
            // 发送邮件协议名称
            props.setProperty("mail.transport.protocol", "smtp");

            MailSSLSocketFactory sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            props.put("mail.smtp.ssl.enable", "true");
            props.put("mail.smtp.ssl.socketFactory", sf);

            Session session = Session.getInstance(props);

            Message msg = new MimeMessage(session);
            msg.setSubject("Farent邮箱验证码");
            StringBuilder builder = new StringBuilder();
            builder.append("感谢您使用极速租车，你的邮箱验证码是"+code+"。");
            builder.append("\n30分钟内有效。");
            builder.append("\n如果你未使用极速租车，请忽略此邮件。");
            msg.setText(builder.toString());
            msg.setFrom(new InternetAddress("15736267103@163.com"));

            Transport transport = session.getTransport();
            transport.connect("smtp.163.com", "15736267103@163.com", "ted1234");

            transport.sendMessage(msg, new Address[] { new InternetAddress(email) });
            transport.close();
        }catch (Exception e){
	        e.printStackTrace();
        }

		return code;
	}


}
