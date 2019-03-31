<html>
<body>
<form method="post">
    <table>
        <tr>
            <td>Englist:</td>
            <td><input type="text" name="english" placeholder="input word" value="${englishWord}"></td>
            <td>${WordError}</td>
        </tr>
        <tr>
            <td>VietNamese:</td>
            <td><input type="text" name="vietnamese" disabled value="${vietNameseWord}"></td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Submit"></td>
        </tr>
        <tr>
            <td></td>
            <td>${result}</td>
        </tr>
    </table>
</form>
</body>
</html>
