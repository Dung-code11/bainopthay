/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bainopthayday2.bt1;

/**
 *
 * @author DUNG LE
 */
public class UserSession {
    private static int onlineCount = 0;
    public UserSession(){
        onlineCount++;
    }
    public void logout(){
        if(onlineCount > 0){
             onlineCount--;
        }
    }
    public static int getOnlineCount(){
        return onlineCount;
    }
    public static void main(String[] args) {
        UserSession user1 = new UserSession();
         UserSession user2 = new UserSession();
          UserSession user3 = new UserSession();
          System.out.println("Nguoi dung online: " +UserSession.getOnlineCount());
          user2.logout();
          System.out.println("Nguoi dung online sau khi 1 nguoi dang xuat: " +UserSession.getOnlineCount());
    }
}
