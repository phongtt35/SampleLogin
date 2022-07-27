/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import utility.EmailSender;


/**
 *
 * @author phongtt
 * @description Xử lý đăng nhập, quên mật khẩu
 */
public class XacThucService {
    
    // Hàm này dùng để xác thực thông tin người dùng nhập vào
    public boolean xacThuc(String tenTaiKhoan, String matKhau) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void resetMatKhau(String email) {
        try {
            // Tạo mật khẩu mới
            String matKhauMoi = "123456";
        
            // Gửi mật khẩu mới cho người dùng
            EmailSender.guiMail(email, "Reset Password", matKhauMoi);
            
            // Gọi Repo cập nhật mật khẩu theo email
            // repo.update();
        } catch (MessagingException ex) {
            System.out.println("Lỗi gửi mail");
        }
    }
}
