# Cavium Octeon III

DEFAULTTUNE ?= "octeon2"
include conf/machine/include/octeon.inc

KERNEL_IMAGETYPE ?= "vmlinux.64"
KERNEL_OUTPUT ?= "vmlinux.64"

MACHINE_EXTRA_RRECOMMENDS += "kernel-module-octeon-ethernet"