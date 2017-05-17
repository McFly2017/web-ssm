/**
 * Created by Notes on 2017/5/3.
 */
new Vue({
    el: '#user_tb',
    data: {
        user:'',
        userList: []
    },
    methods: {
        getUserInfo:function () {
            var self = this;
            $.ajax({
                url: '/rest/'+self.user,
                method: 'POST',
                dataType: 'json',
                statusCode: {
                    404: function () {
                        alert("您还没有创建用户");
                    }
                },
                success: function (data) {
                    self.userList = data;
                }
            });
        }
    }
})
