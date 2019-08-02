package io.renren.common.utils;


 
public class MailTest {
	public static void send(String args) {
 
        MailOperation operation = new MailOperation();
        String user = "codecareer_kdss@163.com";//邮箱地址
        String MailPassword = "wh2015109228";//邮箱授权码
        String host = "smtp.163.com";//SMTP服务器主机地址
        String from = "codecareer_kdss@163.com";//邮箱地址,与上边的user是同一个
        String to = "fkuevip@163.com";// 收件人的邮箱
        String subject = args+"服务宕机";//输入邮件主题
        //邮箱内容
        StringBuffer sb = new StringBuffer();
        sb.append("<!DOCTYPE><div bgcolor='#f1fcfa' style='border:1px solid #d9f4ee; font-size:14px; line-height:22px; color:#005aa0;padding-left:1px;padding-top:5px; padding-bottom:5px;'>"
        		+ "<span style='font-weight:bold;'>温馨提示：</span>"
        		+ "<div style='width:950px;font-family:arial;'>"
        		+ "欢迎使用雅南AGV智能监控系统，尊敬的用户："
        		+ "<br/>"
        		+ "<h2 style='color:green'>+"
        		+ "系统检测到相关服务异常断开，请及时重启或联系管理人员！"
        		+ "</h2>"
				+ "<br/>"
				+ "本邮件由系统自动发出，请勿回复。<br/>"
				+ "感谢您的使用。"
				+ "<br/>"
				+ "雅南AGV智能监控系统"
				+ "</div>"
				+ "</div>");
        try {
            String res = operation.sendMail(user, MailPassword, host, from, to,
                    subject, sb.toString());
            
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}