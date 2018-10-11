package com.jk.controller;

import com.jk.domain.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <pre>项目名称：springboot-one
 * 类名称：UserController
 * 类描述：
 * 创建人：史航启
 * 创建时间：2018/10/10 16:04
 * 修改人：史航启
 * 修改时间：2018/10/10 16:04
 * 修改备注：
 * @version </pre>
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("toQueryUser")
    public String toQueryUser(){
        return "showUser";
    }
    /** <pre>(查询)
	 * 创建人：史航启
	 * 创建时间：2018/10/10 18:28
	 * 修改人：史航启
	 * 修改人电话：15729095987
	 * 修改时间：2018/10/10 18:28
	 * 修改备注：
	 * @return</pre>
	 */
    @RequestMapping("queryUser")
    @ResponseBody
    public List<User> queryUser(){
        List<User> userList = userService.queryUser();
        System.out.println("kjhgfd");
        return userList;
    }

    /** <pre>(添加)
    	 * 创建人：史航启
    	 * 创建时间：2018/10/10 18:33
    	 * 修改人：史航启
    	 * 修改人电话：15729095987
    	 * 修改时间：2018/10/10 18:33
    	 * 修改备注：
    	 * @return</pre>
    	 */
    @RequestMapping("addUser")
    public boolean addUser(User user){
        try {
            userService.addUser(user);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @RequestMapping("toAddUserInfo")
    public String toAddUserInfo(){
        return "addUser";
    }

    /** <pre>(删除)
    	 * 创建人：史航启
    	 * 创建时间：2018/10/10 18:35
    	 * 修改人：史航启
    	 * 修改人电话：15729095987
    	 * 修改时间：2018/10/10 18:35
    	 * 修改备注：
    	 * @return</pre>
    	 */
    @RequestMapping("deleteUser")
    @ResponseBody
    public boolean deleteUser(String ids){
        try {
            userService.deleteUser(ids);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @RequestMapping("queryUserById")
    public String queryUserById(String id, Model model){
        User user = userService.queryUserById(id);
        model.addAttribute("user",user);
        return "editUser";
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public boolean updateUser(User user){
        try {
            userService.updateUser(user);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
