# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "The microstrain_inertial_rqt package provides several RQT widgets to view the status of Microstrain devices"
AUTHOR = "Rob Fisher <rob.fisher@parker.com>"
HOMEPAGE = "https://github.com/LORD-MicroStrain/microstrain_inertial"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "microstrain_inertial"
ROS_BPN = "microstrain_inertial_rqt"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    microstrain-inertial-msgs \
    nav-msgs \
    rclpy \
    rqt-gui \
    rqt-gui-py \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    microstrain-inertial-msgs \
    nav-msgs \
    rclpy \
    rqt-gui \
    rqt-gui-py \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    microstrain-inertial-msgs \
    nav-msgs \
    rclpy \
    rqt-gui \
    rqt-gui-py \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/microstrain_inertial-release/archive/release/humble/microstrain_inertial_rqt/2.7.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/microstrain_inertial_rqt"
SRC_URI = "git://github.com/ros2-gbp/microstrain_inertial-release;${ROS_BRANCH};protocol=https"
SRCREV = "1747eb96bbc2c917eb42e32fec555a9f8f9984b5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
