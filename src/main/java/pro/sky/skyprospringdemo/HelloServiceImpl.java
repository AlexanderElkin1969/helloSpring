package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String hello(){
        return "<b>Hello</b>";
    }
    public String answerHello(String userName){
        return "<b>Hello</b> " + userName;
    }
}
