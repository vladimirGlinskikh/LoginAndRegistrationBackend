package kz.zhelezyaka.loginandregistrationbackend.email;

public interface EmailSender {
    void send(String to, String email);
}
