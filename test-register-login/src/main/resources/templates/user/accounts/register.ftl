<!DOCTYPE html>

<html lang="en-US">

<body class="page-sub-page page-create-account page-account" id="page-top">
<div class="wrapper">
    <div id="page-content">

        <div class="container">
            <header><h1>注册账号</h1></header>
            <div class="row">
                <div class="col-md-4 col-sm-6 col-md-offset-4 col-sm-offset-3">
                    <form role="form" id="form-create-account" method="post" enctype="multipart/form-data" action="/accounts/register">
           
                        <hr>
                        <div class="form-group">
                            <label for="form-create-account-full-name">用户名:</label>
                            <input type="text" class="form-control" id="form-create-account-full-name" name="username" required>
                        </div>
                        <div class="form-group">
                            <label for="form-create-account-email">密码:</label>
                            <input type="password" class="form-control" id="form-create-account-email"  name="password" required>
                        </div>
                        <div class="form-group">
                            <label for="form-create-account-email">Email：</label>
                            <input type="text" class="form-control" id="form-create-account-email"  name="email" >
                        </div>
                        <div class="form-group">
                            <label for="form-create-account-password">昵称:</label>
                            <input type="text" class="form-control" id="form-create-account-password" name="nickname" required>
                        </div>
                        <div class="form-group">
                            <label for="form-create-account-confirm-password">真实姓名:</label>
                            <input type="text" class="form-control" id="form-create-account-confirm-password" name="realname" required>
                        </div>

                        
                        <div class="form-group clearfix">
                            <button type="submit" class="btn pull-right btn-default" id="account-submit">注册账号</button>
                        </div>
                        

                    </form>
                    <hr>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>