<%@ page %><%--
  Created by IntelliJ IDEA.
  User: danii
  Date: 2/8/2024
  Time: 5:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>Array sort</title>
</head>
<body>
    <div class="w-100 d-inline-flex border-bottom font-monospace">
        <span class="fs-2 fw-bold" style="margin: 20px auto">Сортировщик массива чисел</span>
    </div>
    <jsp:useBean id="sort" scope="request" class="com.github.lemongrab32.arraysort.model.Sorter"/>
    <div id="form">
        <form class="m-3" method="post" action="array_sort">
            <dl>
                <dt class="fw-bold fs-4 mb-4">Введите числа через запятую: </dt>
                <dd><input class="w-25" id="arr_input" name="nums" type="text" placeholder="1, 2, 3, ..."></dd>
            </dl>
            <button type="submit">Send</button>
        </form>
    </div>
    <h3>${res}</h3>
</body>
</html>
