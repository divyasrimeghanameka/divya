//app.py
from flask import Flask, render_template, request

app = Flask(__name__)

@app.route('/')
def login():
    return render_template('login.html')

@app.route('/login', methods=['POST'])
def login_user():
    username = request.form['username']
    password = request.form['password']

    if username == "admin" and password == "1234":
        return "Login Successful ✅"
    else:
        return "Invalid Credentials ❌"

if __name__ == '__main__':
    app.run(debug=True, port=3000)


//login.html
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

    <h2>Login Page</h2>

    <form action="/login" method="post">
        <label>Username:</label><br>
        <input type="text" name="username" required><br><br>

        <label>Password:</label><br>
        <input type="password" name="password" required><br><br>

        <button type="submit">Login</button>
    </form>

</body>
</html>
