from xmlrpc.server import SimpleXMLRPCServer

def celsius_to_fahrenheit(c):
    return (c * 9/5) + 32

def fahrenheit_to_celsius(f):
    return (f - 32) * 5/9

server = SimpleXMLRPCServer(("13.60.196.189", 5000))
print("Temperature RPC Server running on port 8000...")

server.register_function(celsius_to_fahrenheit, "c_to_f")
server.register_function(fahrenheit_to_celsius, "f_to_c")

server.serve_forever()
