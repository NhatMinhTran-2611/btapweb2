<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Amatic+SC">
    <style>
        .info-label {
            margin-right: 10px; /* Điều chỉnh khoảng cách giữa label và span */
        }
    </style>
</head>

<body>
    <h1>Thanks for joining our email list</h1>

    <p>Here is the information that you entered:</p>

    <label class="info-label">Email:</label>
    <span>${user.email}</span><br>
    <label class="info-label">First Name:</label>
    <span>${user.firstName}</span><br>
    <label class="info-label">Last Name:</label>
    <span>${user.lastName}</span><br>
    <label class="info-label">Date of Birth:</label>
    <span>${user.date}</span><br>
    <label class="info-label">How did you hear about us?</label>
    <span>${user.preference}</span><br>
    <label class="info-label">Receive Announcements:</label>
    <span>
        <c:forEach var="announcement" items="${user.receiveAnnouncements}">
            ${announcement}<br>
        </c:forEach>
    </span><br>
    <label class="info-label">Preferred Contact Method:</label>
    <span>${user.contactMethod}</span><br>

    <p>To enter another email address, click on the Back 
        button in your browser or the Return button shown 
        below.</p>

    <form action="index.html" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>

</body>
</html>
