# This linux-octeon-lts recipe builds a special linux kernel for
# Octeon based machines.
#
# It is based on openela kernel [2] (which is linux stable 4.14) and patches
# from Marvell linux kernel [1] and also from [4]. The final merge has been publish at [3].
#
# 1: https://github.com/MarvellEmbeddedProcessors/Octeon-Linux-kernel-4.14
# 2: https://github.com/openela/kernel-lts/tree/linux-4.14.y
# 3: https://github.com/joaohf/Octeon-Linux-kernel-4.14
# 4: https://github.com/cavium-octeon-open-source/linux

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}-4.14:"

KBRANCH ?= "v4.14/standard/base"

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://github.com/joaohf/Octeon-Linux-kernel-4.14.git;protocol=https;branch=${KBRANCH} \
           git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-4.14;destsuffix=${KMETA} \
           file://defconfig"

SRCREV ?= "1f8052f48a4bfd32ea38b9c599fee6a9eaf5d3ff"
LINUX_VERSION ?= "4.14.356-openela"
PV = "${LINUX_VERSION}+git"

# board specific branches
KBRANCH:sff-ref-cn71xx-64 ?= "cavium-openela-4.14.y"

SRCREV_machine:sff-ref-cn71xx-64 = "1f8052f48a4bfd32ea38b9c599fee6a9eaf5d3ff"

SRCREV_meta ?= "3435617380af107e31ec4e36173b9cf1f8a371a0"

KMETA = "kernel-meta"
KCONF_BSP_AUDIT_LEVEL = "0"

COMPATIBLE_MACHINE:sff-ref-cn71xx-64 = "sff-ref-cn71xx-64"

#KERNEL_DEVICETREE += "cavium-octeon/octeon_sff7000.dts"

#KERNEL_DTS += "octeon_sff7000"