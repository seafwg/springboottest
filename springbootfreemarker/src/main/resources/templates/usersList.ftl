<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
  <table border="1" aligin="center" width="50%">
    <tr>
      <th>Name</th>
      <th>Sex</th>
      <th>Age</th>
    </tr>
<#--  list标记是迭代返回的list数据 后面list就是返回的数据的key-->
    <#list list as user>
      <tr>
        <td>${user.userName}</td>
        <td>${user.userSex}</td>
        <td>${user.userAge}</td>
      </tr>
    </#list>
  </table>
</body>
</html>