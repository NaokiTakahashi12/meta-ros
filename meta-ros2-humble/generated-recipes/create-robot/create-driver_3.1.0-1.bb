# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS driver for iRobot's Create and Roomba platforms, based on libcreate"
AUTHOR = "Jacob Perron <jacobmperron@gmail.com>"
ROS_AUTHOR = "Jacob Perron <jacobmperron@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/create_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "create_robot"
ROS_BPN = "create_driver"

ROS_BUILD_DEPENDS = " \
    create-msgs \
    diagnostic-msgs \
    diagnostic-updater \
    geometry-msgs \
    libcreate \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    create-msgs \
    diagnostic-msgs \
    diagnostic-updater \
    geometry-msgs \
    libcreate \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    create-msgs \
    diagnostic-msgs \
    diagnostic-updater \
    geometry-msgs \
    libcreate \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/AutonomyLab/create_autonomy-release/archive/release/humble/create_driver/3.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/create_driver"
SRC_URI = "git://github.com/AutonomyLab/create_autonomy-release;${ROS_BRANCH};protocol=https"
SRCREV = "a81cd010f673172c88e7cc76d5d4643d9e9919e9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}