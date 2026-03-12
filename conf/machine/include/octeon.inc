# Cavium Octeon Soc 

SOC_FAMILY = "octeon"
include conf/machine/include/soc-family.inc
require conf/machine/include/mips/tune-octeon.inc

IMAGE_FSTYPES += "ext4 tar.gz"

SERIAL_CONSOLES ?= "115200;ttyS0 115200;ttyS1"

MACHINE_EXTRA_RRECOMMENDS ?= " kernel-modules"
PREFERRED_VERSION_linux-yocto ?= "6.6%"
PREFERRED_PROVIDER_virtual/kernel ?= "linux-yocto"