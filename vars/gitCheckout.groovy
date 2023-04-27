#!/usr/bin/env groovy

def call(String repository) {
    try {
        println("Checkout Source Code")
    } catch(Exception e) {
        println(e)
    }
}