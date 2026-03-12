FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}-6.6:"

KBRANCH:sff-ref-cn71xx-64 ?= "v6.6/standard/mti-malta64"

SRCREV_machine:sff-ref-cn71xx-64 ?= "b7972053efd2ad49abf9a0637dfa2b4b1bdff8a4"

SRC_URI += "file://defconfig"

KCONF_BSP_AUDIT_LEVEL = "0"
COMPATIBLE_MACHINE:sff-ref-cn71xx-64 = "sff-ref-cn71xx-64"

LINUX_VERSION:sff-ref-cn71xx-64 = "6.6.126"