# -*- coding: utf-8 -*-
"""
Created on Mon Sep 25 07:25:35 2017

@author: shakil
"""

l=[]
n=int(input("Enter the number of elements:"))
print("Enter the elements")
for i in range(0,n):
    element=float(input())
    l.append(element)
x=float(input("What's the number you are looking for?"))
high=n-1
low=0
found=False
while(low<=high and found==False):
    m=int((high+low)/2)
    if(x==l[m]):
        print("Found")
        found=True
        break
    elif(x<l[m]):
        high=m-1
    else:
        low=m+1
if(found==False):
    print("Not found")
