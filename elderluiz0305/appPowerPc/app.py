import customtkinter as ctk;
import os;
from tkinter import *;


#----FUNÇÕES----
def off():
    os.system('shutdown /s /t 0');  
def restart():
    os.system('shutdown /r /t 0'); 
def log():    
    os.system('shutdown -b');  
#---------------

janela=ctk.CTk()
janela.geometry("200x380")
janela.title("Power Off App")
    
#PowerOFF
off_img = PhotoImage(file="appPowerPc/powerOff.png")
btn_off = Button(janela,image=off_img,borderwidth=0,command=off)
btn_off.pack(pady=30)
#RESTART
restart_img = PhotoImage(file="appPowerPc/restart.png")
btn_restart = Button(janela,image=restart_img,borderwidth=0, command=restart)
btn_restart.pack(pady=30)
#LOGOUT
log_img = PhotoImage(file="appPowerPc/logOut.png")
btn_log = Button(janela,image=log_img,borderwidth=0, command=log)
btn_log.pack(pady=30)
janela.mainloop()