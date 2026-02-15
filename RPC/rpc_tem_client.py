import xmlrpc.client

server = xmlrpc.client.ServerProxy("http://13.60.196.189:5000/")

c = float(input("Enter temperature in Celsius: "))
print("Fahrenheit:", server.c_to_f(c))

f = float(input("Enter temperature in Fahrenheit: "))
print("Celsius:", server.f_to_c(f))
