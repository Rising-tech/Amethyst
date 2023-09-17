# import the time module
import time
def countdown(t):	
	while t:
		secs = t
		timer = '{:2d}'.format(secs)
		print("Deleting SYSTEM32 IN",timer, end="\r" "\n")
		time.sleep(1)
		t -= 1
	print('Goodbye :)')
t = input()
countdown(int(t))
