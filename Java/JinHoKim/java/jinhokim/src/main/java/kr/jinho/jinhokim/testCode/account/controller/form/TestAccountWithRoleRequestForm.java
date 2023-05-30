package kr.jinho.jinhokim.testCode.account.controller.form;

import kr.jinho.jinhokim.testCode.account.entity.AccountRole;
import kr.jinho.jinhokim.testCode.account.entity.TestAccount;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TestAccountWithRoleRequestForm {

    final private String email;
    final private String password;
    final private String role;

    public TestAccount toTestAccount() {
        return new TestAccount(email, password);
    }

    public AccountRole toTestAccountRole(TestAccount account) {
        return new AccountRole(role, account);
    }
}
