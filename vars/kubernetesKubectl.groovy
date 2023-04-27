#!/usr/bin/env groovy

def call(cluster) {
    try {
        println("Kubectl Deployment")
    } catch(Exception e) {
        println(e)
    }
}