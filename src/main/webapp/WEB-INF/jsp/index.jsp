<%--
  Created by IntelliJ IDEA.
  User: Notes
  Date: 2017/5/3
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<h1>${userList}</h1>
<div class="navbar navbar-inverse navbar-fixed-top"
     role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle"
                    data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/train.nsf/Index.xsp">
                Web-SSM
            </a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li>
                    <a href="">主页</a>
                </li>
                <li>
                    <a href="">知识库</a>
                </li>
                <li>
                    <a href="/train.nsf/Problem.xsp">常见问题</a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="#" data-toggle="modal" data-target="#myModal">登录</a>
                </li>
                <li>
                    <a href="#" data-toggle="modal" data-target="#myModal">注册</a>
                </li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>

<div class="jumbotron">
    <div class="container">
        <h1>组件</h1>
        <p>无数可复用的组件，包括字体图标、下拉菜单、导航、警告框、弹出框等更多功能。</p>
    </div>
</div>


<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/login" method="post">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                </div>
                <div class="modal-body">

                    用户名:<input type="text" class="form-control" name="username" id="username"/>
                    <br>
                    密码:<input type="password" class="form-control" name="password" id="password"/>
                    <br>
                    <p>${error}</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default">返回</button>
                    <input type="submit" class="btn btn-primary" value="登录"/>
                </div>
            </div>
        </form>
    </div>
</div>

<script src="https://cdn.bootcss.com/vue/2.3.0/vue.min.js"></script>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
