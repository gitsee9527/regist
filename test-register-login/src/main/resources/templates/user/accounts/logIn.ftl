<!DOCTYPE html>

<html lang="en-US">

<body class="page-sub-page page-create-account page-account" id="page-top">
<!-- Wrapper -->
<div class="wrapper">
    <div id="page-content">
        <div class="container">
        </div>
        <!-- end Breadcrumb -->

        <div class="container">
            <header><h1>登录</h1></header>
            <div class="row">
                <div class="col-md-4 col-sm-6 col-md-offset-4 col-sm-offset-3">
                    <form role="form" id="form-create-account" method="post" action="/accounts/logIn">
                        <div class="form-group">
                            <label for="form-create-account-email">Email:</label>
                            <input type="text"  name="username" value="${username!}" class="form-control" id="form-create-account-email" required>
                        </div><!-- /.form-group -->
                        <div class="form-group">
                            <label for="form-create-account-password">密码:</label>
                            <input type="password" name="password" value="${password!}" class="form-control" id="form-create-account-password" required>
                        </div><!-- /.form-group -->
                        <input type="hidden" value="${target!}" name="target" />
                        <div class="form-group clearfix">
                            <button type="submit" class="btn pull-right btn-default" id="account-submit">登录</button>
                        </div><!-- /.form-group -->
                    </form>
                    <hr>
                </div>
            </div>
    </div>
</div>

</body>
</html>