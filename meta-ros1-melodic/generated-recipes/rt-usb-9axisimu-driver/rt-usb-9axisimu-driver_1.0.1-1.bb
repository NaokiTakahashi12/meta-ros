# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The rt_usb_9axisimu_driver package"
AUTHOR = "RT Corporation <shop@rt-net.jp>"
ROS_AUTHOR = "RT Corporation <shop@rt-net.jp>"
HOMEPAGE = "https://github.com/rt-net/rt_usb_9axisimu_driver/wiki"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rt_usb_9axisimu_driver"
ROS_BPN = "rt_usb_9axisimu_driver"

ROS_BUILD_DEPENDS = " \
    roscpp \
    roslint \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    roslint \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp \
    roslint \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/rt-net-gbp/rt_usb_9axisimu_driver-release/archive/release/melodic/rt_usb_9axisimu_driver/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rt_usb_9axisimu_driver"
SRC_URI = "git://github.com/rt-net-gbp/rt_usb_9axisimu_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "60c315e86b15494a657321ad2968035a1e556edc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}