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
<div class="form-group">
    <div class="btn-group bootstrap-select show-tick show-menu-arrow form-control">
        <button type="button" class="btn dropdown-toggle btn-default" data-toggle="dropdown" data-id="maxOption2"
                title="chicken, turkey" aria-expanded="false"><span
                class="filter-option pull-left">chicken, turkey</span>&nbsp;<span class="caret"></span></button>
        <div class="dropdown-menu open" style="max-height: 101px; overflow: hidden; min-height: 92px;">
            <ul class="dropdown-menu inner" role="menu" style="max-height: 89px; overflow-y: auto; min-height: 80px;">
                <li data-original-index="0" class="selected"><a tabindex="0" class="" style="" data-tokens="null"><span
                        class="text">chicken</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li>
                <li data-original-index="1" class="selected"><a tabindex="0" class="" style="" data-tokens="null"><span
                        class="text">turkey</span><span class="glyphicon glyphicon-ok check-mark"></span></a></li>
                <li data-original-index="2" class="disabled"><a tabindex="-1" class="" style="" data-tokens="null"
                                                                href="#"><span class="text">duck</span><span
                        class="glyphicon glyphicon-ok check-mark"></span></a></li>
                <li data-original-index="3"><a tabindex="0" class="" style="" data-tokens="null"><span class="text">goose</span><span
                        class="glyphicon glyphicon-ok check-mark"></span></a></li>
            </ul>
        </div>
    </div>
</div>
<script src="https://cdn.bootcss.com/vue/2.3.0/vue.min.js"></script>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="application/javascript">
    $(window).on('load', function () {
        $('#usertype').selectpicker({
            'selectedText': '椰子'
        });
    });
</script>
</body>
</html>
