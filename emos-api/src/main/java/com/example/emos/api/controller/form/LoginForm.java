package com.example.emos.api.controller.form;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author Jane
 * @date 2022/12/12 - 14:25
 * 我们首先需要创建一个Form类保存HTTP请求提交的数据，使用Form类的好处是可以为变量设置注解，自动完成后端验证
 */

@Data
@Schema(description = "登陆表单类")
public class LoginForm {
    @NotBlank(message = "username不能为空")
    @Pattern(regexp = "^[a-zA-Z0-9]{5,20}$", message = "username内容不正确")
    @Schema(description = "用户名")
    private String username;

    @NotBlank(message = "password不能为空")
    @Pattern(regexp = "^[a-zA-Z0-9]{6,20}$", message = "password内容不正确")
    @Schema(description = "密码")
    private String password;
}
