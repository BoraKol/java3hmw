
package javaodev3;

public class UserManager {
    public void add(User user){
        System.out.println(user.getFirstName()+" "+ user.getLastName()+" sisteme "
                + " eklenmiştir.");
    }
    public void addMultiple(User[]users){
        for(User user:users){
            this.add(user);
        }
    }
    public void update(User user){
        System.out.println(user.getFirstName()+" "+ user.getLastName()+" isimli kullanıcının "
                + " bilgileri güncellenmiştir.");
    }  
    public void updateMultiple(User[]users){
        for(User user:users){
            this.update(user);
        }
    }
    public void delete(User user){
        System.out.println(user.getFirstName()+" "+ user.getLastName()+" isimli kullanıcı "
                + " silinmiştir.");
    } 
    public void deleteMultiple(User[]users){
        for(User user:users){
            this.delete(user);
        }
    }
    }

